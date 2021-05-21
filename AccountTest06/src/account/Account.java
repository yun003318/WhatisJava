package account;

public class Account {
	// 1. 상속받은 자식에서 사용할 수 있도록 접근 권한을 완화, private -> protected
	// - 접근 권한을 완화하는 방법은 권장되지 않음.
//	protected String name; 
//	protected String no;
//	protected int balance;
	
	private String name; 
	private String no;
	private int balance;
	
	public Account() { }
	
	// 생성자
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// getter 메소드 - 값을 읽는 메소드
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public int getBalance() {
		return balance;
	}
	
	// setter 메소드 - 값을 설정하는 메소드
	public void setName(String name) {
		this.name = name;
	}
		
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public void withdraw(int money) {
		balance -= money;
	}
	
	// 출력
	public void showInfo() {
		System.out.println("계좌명의 : " + name);
		System.out.println("계좌번호 : " + no);
		System.out.println("예금잔고 : " + balance);
		System.out.println();
	}
}
