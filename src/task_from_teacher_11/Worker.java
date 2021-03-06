package task_from_teacher_11;

/**
 * Class contains information about worker (name, payment, ID)
 * and abstact method for calculation average monthly salary.
 * 
 * @author Yakov Medvedev
 *
 */
public abstract class Worker {

	private String _name;
	private double _payment;
	private int _id;
	
	public Worker(String name, double payment, int id) {
		super();
		setName(name);
		setPayment(payment);
		setId(id);
	}

	public Worker() {};

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public double getPayment() {
		return _payment;
	}

	public void setPayment(double payment) {
		_payment = payment;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	/**
	 * Method for calculation of the average monthly salary.
	 * 
	 * @param salary salary rate
	 * @return average monthly salary
	 */
	public abstract double avrgMonSalary(double salary);
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ID_" + getId() + "  " + getPayment() + "  " + getName());	
		return sb.toString();
	}
}
