import java.util.Scanner;

public class Result{
	public static void main(String args[]){
		int java, system_programming, numerical_analysis_design, financial_accounting, microprocessor, roll_number;
		double Result, Total;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name = ");
		name = sc.next();
		System.out.println("enter roll number = ");
        roll_number = sc.nextInt();
		System.out.println("enter marks of java = ");
		java = sc.nextInt();
		System.out.println("enter marks of system_programming = ");
		system_programming = sc.nextInt();
		System.out.println("enter marks of numerical_analysis_design = ");
		numerical_analysis_design = sc.nextInt();
		System.out.println("enter marks of financial_accounting = ");
		financial_accounting = sc.nextInt();
		System.out.println("enter marks of microprocessor = ");
		microprocessor = sc.nextInt();
		System.out.println("name = "+name);
		System.out.println("roll number = "+roll_number);

		if(java < 10){
			System.out.println("your pointer in java is = 1");
			System.out.println("your grade in java is = E");
		            }
			else if((java == 10)||(java < 20 )){
				System.out.println("your pointer in java is = 2");
				System.out.println("your grade in java is = E+");
			}
			else if((java == 20)||(java < 30)){
				System.out.println("your pointer in java is = 3");
				System.out.println("your grade in java is = D");
				    }
			else if((java == 30)||(java < 40)){
				System.out.println("your pointer in java is = 4");
				System.out.println("your grade in java is = D+");
					}
			else if((java == 40)||(java < 50)){
				System.out.println("your pointer in java is = 5");
				System.out.println("your grade in java is = C");
					}
			else if((java == 50)||(java < 60)){
				System.out.println("your pointer in java is = 6");
				System.out.println("your grade in java is = C+");
					}	
			else if((java == 60)||(java < 70)){
				System.out.println("your pointer in java is = 7");
				System.out.println("your grade in java is = B");
					}
			else if((java == 70)||(java < 80)){
				System.out.println("your pointer in java is = 8");
				System.out.println("your grade in java is = B+");
			    	}
			else if((java == 80)||(java < 90)){
				System.out.println("your pointer in java is = 9");
				System.out.println("your grade in java is = A");
					}
			else if((java == 90)||(java < 100)){
				System.out.println("your pointer in java is = 10");
				System.out.println("your grade in java is = A+");
					}
			else{
				System.out.println("Please enter a number between 0 - 100");
					}
		if(system_programming < 10){
			System.out.println("your pointer in system_programming is = 1");
			System.out.println("your grade in system_programming is = E");
		}
			else if((system_programming == 10)||(system_programming < 20 )){
				System.out.println("your pointer in system_programming is = 2");
				System.out.println("your grade in system_programming is = E+");
			}
			else if((system_programming == 20)||(system_programming < 30)){
				System.out.println("your pointer in system_programming is = 3");
				System.out.println("your grade in system_programming is = D");
			    	}
			else if((system_programming == 30)||(system_programming < 40)){
				System.out.println("your pointer in system_programming is = 4");
				System.out.println("your grade in system_programming is = D+");
					}
			else if((system_programming == 40)||(system_programming < 50)){
				System.out.println("your pointer in system_programming is = 5");
				System.out.println("your grade in system_programming is = C");
					}
			else if((system_programming == 50)||(system_programming < 60)){
			    System.out.println("your pointer in system_programming is = 6");
				System.out.println("your grade in system_programming is = C+");
					}
			else if((system_programming == 60)||(system_programming < 70)){
				System.out.println("your pointer in system_programming is = 7");
				System.out.println("your grade in system_programming is = B");
					}
			else if((system_programming == 70)||(system_programming < 80)){
				System.out.println("your pointer in system_programming is = 8");
				System.out.println("your grade in system_programming is = B+");
					}
			else if((system_programming == 80)||(system_programming < 90)){
				System.out.println("your pointer in system_programming is = 9");
				System.out.println("your grade in system_programming is = A");
					}
			else if((system_programming == 90)||(system_programming < 100)){
				System.out.println("your pointer in system_programming is = 10");
				System.out.println("your grade in system_programming is = A+");
					}
					else{
						System.out.println("Please enter a number between 0 - 100");
						}
		if(numerical_analysis_design < 10){
			System.out.println("your pointer in numerical_analysis_design is = 1");
			System.out.println("your grade in numerical_analysis_design is = E");
		     }
			else if((numerical_analysis_design == 10)||(numerical_analysis_design < 20 )){
				System.out.println("your pointer in numerical_analysis_design is = 2");
				System.out.println("your grade in numerical_analysis_design is = E+");
			}
			else if((numerical_analysis_design == 20)||(numerical_analysis_design < 30)){
				System.out.println("your pointer in numerical_analysis_design is = 3");
				System.out.println("your grade in numerical_analysis_design is = D");
			     	}
			else if((numerical_analysis_design == 30)||(numerical_analysis_design < 40)){
			    System.out.println("your pointer in numerical_analysis_design is = 4");
				System.out.println("your grade in numerical_analysis_design is = D+");
					}
			else if((numerical_analysis_design == 40)||(numerical_analysis_design < 50)){
				System.out.println("your pointer in numerical_analysis_design is = 5");
				System.out.println("your grade in numerical_analysis_design is = C+");
					}
			else if((numerical_analysis_design == 50)||(numerical_analysis_design < 60)){
				System.out.println("your pointer in numerical_analysis_design is = 6");
				System.out.println("your grade in numerical_analysis_design is = C");
					}
			else if((numerical_analysis_design == 60)||(numerical_analysis_design < 70)){
				System.out.println("your pointer is in numerical_analysis_design = 7");
				System.out.println("your grade in numerical_analysis_design is = B");
					}
			else if((numerical_analysis_design == 70)||(numerical_analysis_design < 80)){
				System.out.println("your pointer is in numerical_analysis_design = 8");
				System.out.println("your grade in numerical_analysis_design is = B+");
			        }
			else if((numerical_analysis_design == 80)||(numerical_analysis_design < 90)){
				System.out.println("your pointer is in numerical_analysis_design = 9");
			    System.out.println("your grade in numerical_analysis_design is = A");
					}
			else if((numerical_analysis_design == 90)||(numerical_analysis_design < 100)){
				System.out.println("your pointer in numerical_analysis_design is = 10");
				System.out.println("your grade in numerical_analysis_design is = A+");
					}
					else{
						System.out.println("Please enter a number between 0 - 100");
						}
		if(financial_accounting < 10){
			System.out.println("your pointer in financial_accounting is = 1");
			System.out.println("your grade in financial_accounting is = E");
		}
			else if((financial_accounting == 10)||(financial_accounting < 20 )){
				System.out.println("your pointer in financial_accounting is = 2");
				System.out.println("your grade in financial_accounting is = E+");
		        	}
		    else if((financial_accounting == 20)||(financial_accounting < 30)){
				System.out.println("your pointer in financial_accounting is = 3");
				System.out.println("your grade in financial_accounting is = D");
				    }
			else if((financial_accounting == 30)||(financial_accounting < 40)){
				System.out.println("your pointer in financial_accounting is = 4");
				System.out.println("your grade in financial_accounting is = D+");
					}
			else if((financial_accounting == 40)||(financial_accounting < 50)){
				System.out.println("your pointer in financial_accounting is = 5");
				System.out.println("your grade in financial_accounting is = C");
					}
			else if((financial_accounting == 50)||(financial_accounting < 60)){
				System.out.println("your pointer in financial_accounting is = 6");
				System.out.println("your grade in financial_accounting is = C+");
					}
			else if((financial_accounting == 60)||(financial_accounting < 70)){
				System.out.println("your pointer in financial_accounting is = 7");
				System.out.println("your grade in financial_accounting is = B");
					}
			else if((financial_accounting == 70)||(financial_accounting < 80)){
				System.out.println("your pointer in financial_accounting is = 8");
				System.out.println("your grade in financial_accounting is = B+");
					}
			else if((financial_accounting == 80)||(financial_accounting < 90)){
				System.out.println("your pointer in financial_accounting is = 9");
			    System.out.println("your grade in financial_accounting is = A");
					}
			else if((financial_accounting == 90)||(financial_accounting < 100)){
				System.out.println("your pointer in financial_accounting is = 10");
				System.out.println("your grade in financial_accounting is = A+");
					}
					else{
						System.out.println("Please enter a number between 0 - 100");
			     		}

		if(microprocessor < 10){
			System.out.println("your pointer in microprocessor is = 1");
			System.out.println("your grade in microprocessor is = E");
		        }
			else if((microprocessor == 10)||(microprocessor < 20 )){
				System.out.println("your pointer in microprocessor is = 2");
				System.out.println("your grade in microprocessor is = E+");
			}
			else if((microprocessor == 20)||(microprocessor < 30)){
			    System.out.println("your pointer in microprocessor is = 3");
				System.out.println("your grade in microprocessor is = D");
			    	}
			else if((microprocessor == 30)||(microprocessor < 40)){
				System.out.println("your pointer in microprocessor is = 4");
		 		System.out.println("your grade in microprocessor is = D+");
					}
			else if((microprocessor == 40)||(microprocessor < 50)){
				System.out.println("your pointer in microprocessor is = 5");
				System.out.println("your grade in microprocessor is = C");
					}
			else if((microprocessor == 50)||(microprocessor < 60)){
				System.out.println("your pointer in microprocessor is = 6");
				System.out.println("your grade in microprocessor is = C+");
					}
			else if((microprocessor == 60)||(microprocessor < 70)){
				System.out.println("your pointer in microprocessor is = 7");
				System.out.println("your grade in microprocessor is = B");
					}
			else if((microprocessor == 70)||(microprocessor < 80)){
		    	System.out.println("your pointer in microprocessor is = 8");
				System.out.println("your grade in microprocessor is = B+");
					}
			else if((microprocessor == 80)||(microprocessor < 90)){
				System.out.println("your pointer in microprocessor is = 9");
				System.out.println("your grade in microprocessor is = A");
					}
	    	 else if((microprocessor == 90)||(microprocessor < 100)){
	 			System.out.println("your pointer in microprocessor is = 10");
				System.out.println("your grade in microprocessor is = A+");
					}
					else{
						System.out.println("Please enter a number between 0 - 100");
						}
						Total = java + system_programming + numerical_analysis_design + financial_accounting + microprocessor;
						System.out.println("Total number of marks "+Total+ " out of 500");
						Total = Total / 500;
						Result = Total * 100;
						System.out.println("Result in percentage = "+Result);
					}
				}
											
