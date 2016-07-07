package dip.bad;

public class Manager {
	Worker m_worker;

	public void setWorker(Worker w) {
		m_worker=w;
	}

	public void manage() {
		m_worker.work();
	}
}
