package deneme;

interface Banksystem{
	double interestRate =0.15;
	public void updateBalance();
	public void Bankerdetails();
}
abstract class Users{
	String nameString;
	String surnameString;
	int accID;
	double balanceDouble;
	
	public Users(String nameString, String surnameString, int accID, double balanceDouble) {
		this.nameString = nameString;
		this.surnameString = surnameString;
		this.accID = accID;
		this.balanceDouble = balanceDouble;
	}
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getSurnameString() {
		return surnameString;
	}
	public void setSurnameString(String surnameString) {
		this.surnameString = surnameString;
	}
	public int getAccID() {
		return accID;
	}
	public void setAccID(int accID) {
		this.accID = accID;
	}
	public double getBalanceDouble() {
		return balanceDouble;
	}
	public void setBalanceDouble(double balanceDouble) {
		this.balanceDouble = balanceDouble;
	}
	public String toString() {
		return "Users [nameString=" + nameString + ", surnameString=" + surnameString + ", accID=" + accID
				+ ", balanceDouble=" + balanceDouble + "]";
	}
	abstract void interestrate();
	
}
class person extends Users{

	public person(String nameString, String surnameString, int accID, double balanceDouble) {
		super(nameString, surnameString, accID, balanceDouble);
	}
	@Override
	void interestrate() {
		// TODO Auto-generated method stub
		
	}
}

class DepositWithInterest implements Banksystem{
    Users user;
    double amount;
	public DepositWithInterest(Users user, double amount) {
		this.user = user;
		this.amount = amount;
		updateBalance();
	}
	@Override
	public void updateBalance() {
		// TODO Auto-generated method stub
		amount = amount +(amount*interestRate);
		user.setBalanceDouble(amount);
	}
	@Override
	public void Bankerdetails() {
		// TODO Auto-generated method stub
		System.out.println("bu kişinin son parası: "+user.getBalanceDouble());
	}
    
}
class DepositWithoutInterest implements Banksystem{
    Users user;
    double amount;
	public DepositWithoutInterest(Users user, double amount) {
		this.user = user;
		this.amount = amount;
		updateBalance();
	}
	@Override
	public void updateBalance() {
		// TODO Auto-generated method stub
		user.setBalanceDouble(amount);
	}
	@Override
	public void Bankerdetails() {
		// TODO Auto-generated method stub
		System.out.println("bu kişinin son parası: "+user.getBalanceDouble());
	}
    
}
class withdrawwithInterest implements Banksystem{
    Users user;
    double amount;
	public withdrawwithInterest(Users user, double amount) {
		this.user = user;
		this.amount = amount;
		updateBalance();
	}
    public void updateBalance() {
        double penalty = amount * interestRate;
        double newBalance = user.getBalanceDouble() - amount - penalty;
        user.setBalanceDouble(newBalance);
    }

    public void Bankerdetails() {
        System.out.println("Faizli Çekim: " + amount + ", Yeni Bakiye: " + user.getBalanceDouble());
    }
    
}
class withdrawwithoutInterest implements Banksystem{
    Users user;
    double amount;
	public withdrawwithoutInterest(Users user, double amount) {
		this.user = user;
		this.amount = amount;
		updateBalance();
	}
    public void updateBalance() {
        double newBalance = user.getBalanceDouble() - amount;
        user.setBalanceDouble(newBalance);
    }

    public void Bankerdetails() {
        System.out.println("Faizli Çekim: " + amount + ", Yeni Bakiye: " + user.getBalanceDouble());
    }
    
}

public class try2 {
	public static void main(String[] args) {
		Users user1 = new person("alis", "te", 14, 3.4);
		Users user2 = new person("als", "ten", 24, 4.4);
		Users user3 = new person("ais", "tene", 34, 5.4);
		Users user4 = new person("is", "ene", 44, 6.4);
		DepositWithInterest depositWithInterest1 = new DepositWithInterest(user1, 10);
		DepositWithoutInterest depositWithoutInterest1 = new DepositWithoutInterest(user2, 100);
		withdrawwithInterest withdrawwithInterest1 = new withdrawwithInterest(user3, 1000);
		withdrawwithoutInterest withdrawwithoutInterest = new withdrawwithoutInterest(user4, 10000);
		depositWithInterest1.Bankerdetails();
		depositWithoutInterest1.Bankerdetails();
		withdrawwithInterest1.Bankerdetails();
		withdrawwithoutInterest.Bankerdetails();
	}
}
