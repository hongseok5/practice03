package prob05;

public class Account {
	
	private String accountNO;
	private int balance;
	
	public Account(String a) {
		
		accountNO = a;
		System.out.println(a + "계좌가 개설되었습니다.");
		
	}
	
	
	
	
	public String getAccountNO() {
		return accountNO;
	}
	public void setAccountNO(String accountNO) {
		this.accountNO = accountNO;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void save(int a) { //입금
		balance += a;
		System.out.println(accountNO + " 계좌에 " + a + "만원이 입금되었습니다.");
	}
	public void deposit(int b) { //출금
		balance -= b;
		System.out.println(accountNO + " 계좌에 " + b + "만원이 출금되었습니다.");
	}
	
	
	
	
	
	
	
	
}
