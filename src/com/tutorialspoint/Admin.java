package com.tutorialspoint;
/*
 * For creating a Singleton type
 * from the xml and only one instance
 */

	public class Admin {
		private String name;
		private int id;
		public void getName() {
			System.out.println(name);
		}
		public void setName(String name) {
			this.name = name;
		}
		public void getId() {
			System.out.println(id);
		}
		public void setId(int id) {
			this.id = id;
		}
	
	}
