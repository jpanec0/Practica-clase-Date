/*Clase Date*/

	public class Date{
		
		public int day;
		public int month;
		public int year;
	
	/*The isSameYear method*/
		void isSameYear(){
			
			System.out.println("El año es el mismo");
		}
	
	/*The isSameMonth method*/
		public void isSameMonth(){
			
			System.out.println("El mes es el mismo");
		}
		
	/*The isSameDay method*/	
		public void isSameDay(){
			
			System.out.println("El dia es el mismo");
		}
	/*The isSame method*/	
		public void isSame(){
			
			System.out.println("Lafecha es la misma");
		}
		
	/*A method that prints the name of the month*/
		public void nameMonth(){
			
			System.out.println("El me es el:"+ this.month);
		}
		
	/*A method that checks if the day of the month is right*/	
		public void rightDay(){
			
			this.month = month;
			this.day = day;
			
			if((month = 1) || (month = 3) || (month = 5) || (month = 7) || (month = 8) || (month = 10) || (month = 12)){
				if((day < 1) || (day > 31)){
				System.out.println("El dia es correcto");
				}
				else{
				System.out.println("El dia no existe");
				}
			}
			if(month = 2){
				if((day < 1) || (day > 28)){
				System.out.println("El dia es correcto");
				}
				else{
				System.out.println("El dia no existe");
			}
			if((month = 4) || (month = 6) || (month = 9) || (month = 11)){
				if((day < 1) || (day > 30)){
				System.out.println("El dia es correcto");
				}
				else{
				System.out.println("El dia no existe");
			}
		}
	
	/*A method that prints the season of this month*/
		public void seasonMonth(){
			
			this.month = month;
			
			if((month = 9) || (month = 10) || (month = 11)){
				System.out.println("Es otoño");
			}
			if((month = 12) || (month = 1) || (month = 2)){
				System.out.println("Es invierno");
			}
			if((month = 3) || (month = 4) || (month = 5)){
				System.out.println("Es primavera");
			}
			if((month = 6) || (month = 7) || (month = 8)){
				System.out.println("Es verano");
			}
		}
		
	/*For a date, print the months left until the end of the year*/
		public static void monthsLeftToTheEnd(){
		
			
		}
	
	}	