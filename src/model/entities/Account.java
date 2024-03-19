package model.entities;

import model.exceptions.Exceptions;

public class Account {

		private Integer number;
		private String holder;
		private Double balance;
		private Double withdrawLimit;
		
		public Account() {
		}

		public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
			this.number = number;
			this.holder = holder;
			this.balance = balance;
			this.withdrawLimit = withdrawLimit;
		}

		public Integer getNumber() {
			return number;
		}

		public void setNumber(Integer number) {
			this.number = number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public Double getWithdrawLimit() {
			return withdrawLimit;
		}

		public void setWithdrawLimit(Double withdrawLimit) {
			this.withdrawLimit = withdrawLimit;
		}

		public Double getBalance() {
			return balance;
		}
		
		public void Deposit(Double amount) {
			balance += amount;
		}
		
		public void Withdraw(Double amount) {
			ValidateWithdraw(amount);
			balance -= amount;
		}
		
		private void ValidateWithdraw(Double amount) {
			if (amount > getWithdrawLimit()) {
				throw new Exceptions("Withdraw error: the amount exceeds withdraw limit");
			}
			if (amount > balance) {
				throw new Exceptions("Withdraw error: not enough balance");
			}
		}
}
