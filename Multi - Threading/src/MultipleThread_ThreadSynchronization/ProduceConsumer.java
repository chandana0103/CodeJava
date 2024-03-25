package MultipleThread_ThreadSynchronization;
//Write a java program on Produce – Consumer

public class ProduceConsumer {

	int value;
	boolean pro_thread = true;

	synchronized void produce(int i) {
		if (pro_thread == true) {
			value = i;
			System.out.println("Procuder Has Produced Product " + value);
			pro_thread = false;
			notify();
		}
		try {
			wait();
		} catch (InterruptedException ie) {
		}
	}

	synchronized int consume() {
		if (pro_thread == true) {
			try {
				wait();
			} catch (InterruptedException ie) {
			}
		}
		pro_thread = true;
		notify();
		return value;
	}
}

class Producer implements Runnable {
	ProduceConsumer sr;

	Producer(ProduceConsumer sr) {
		this.sr = sr;
	}

	public void run() {
		int i = 1;
		while (true) {
			sr.produce(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}
			i++;
		}
	}
}

class Consumer implements Runnable {
	ProduceConsumer sr;

	Consumer(ProduceConsumer sr) {
		this.sr = sr;
	}

	public void run() {
		while (true) {
			int res = sr.consume();
			System.out.println("Consumer Has Taken Product " + res);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}
		}
	}
}

class ProducerConsumer {
	public static void main(String args[]) {
		ProduceConsumer sr = new ProduceConsumer();
		Producer p = new Producer(sr);
		Consumer c = new Consumer(sr);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}

}
