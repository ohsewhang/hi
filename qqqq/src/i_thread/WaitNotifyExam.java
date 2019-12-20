package i_thread;

public class WaitNotifyExam {

	public static void main(String[] args) {
		DataBox databox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(databox);
		ConsumerThread consumerThread = new ConsumerThread(databox);
		
		producerThread.start();
		consumerThread.start();
		

	}

}
