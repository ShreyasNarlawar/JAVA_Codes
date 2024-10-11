package com.demo.beans;

public class SavingAccount extends Accounts{
		private static float int_rate;
		private static float min_bal;
		private int min_trans;
		private int chequBknum;
		static {
			int_rate=0.6f;
			min_bal=5000.0f;
		}
		SavingAccount(){
			super("s");
		}
		SavingAccount(String aname,int pin,String Que,String Ans,double balance,int chequBknum){
			super("s",aname,pin,Que,Ans,balance);
			this.chequBknum=chequBknum;
		}
		public static float getMin_bal() {
			return min_bal;
		}
		public static void setMin_bal(float min_bal) {
			SavingAccount.min_bal = min_bal;
		}
		public int getMin_trans() {
			return min_trans;
		}
		public void setMin_trans(int min_trans) {
			this.min_trans = min_trans;
		}
		public int getChequBknum() {
			return chequBknum;
		}
		public void setChequBknum(int chequBknum) {
			this.chequBknum = chequBknum;
		}
		@Override
		public String toString() {
			return super.toString()+"SavingAccount [min_trans=" + min_trans + ", chequBknum=" + chequBknum + "]";
		}
		@Override
		public int compareTo(Accounts o) {
			// TODO Auto-generated method stub
			return 0;
		}
		

}
