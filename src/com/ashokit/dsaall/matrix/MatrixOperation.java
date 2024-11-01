package com.ashokit.dsaall.matrix;

public class MatrixOperation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//create a 2*2
		int a[][]={{3,5},{1,7}};
		int b[][]={{2,4},{8,6}};
		//create 1*4
         int c[]= {1,2,3,4};
         //create 4*4
         int d[][]= {{1,2,3,4},{5,6,7,8}};
         
         System.out.println(c.length);//it give the column
       System.out.println(d.length);//it gitves row
       System.out.println(d[0].length);//it give the column
       
       addmatrix(a,b);
       
       int e[][]= {{2},{4}};
       System.out.println("matrix multiplcation");
       multiplicationmatrix(a,e);
       
       System.out.println("matrix tranpose");
       
       transpose(a);
       
       System.out.println("matrix tranpose symetric");
       
       int f[][]= {{2,2},{2,2}};
       System.out.println(isSymmetric(f));
	}

	private static void addmatrix(int[][] a, int[][] b) throws Exception {
		// TODO Auto-generated method stub
		//check rows and column
		int rows=a.length;
		int column=a[0].length;
		
		int[][] m =new int[rows][column];
		
		if(a!=null && b!=null)
		{
			
			
			if(!(a.length==b.length  && a[0].length==b[0].length))
			{
				throw new Exception("matrix addtion not possible given rows and column");
			}
					else
					{
						for (int i = 0; i <rows ; i++) {
							
							for (int j = 0; j < column; j++) {
								
								    //additon
								m[i][j]=a[i][j]+b[i][j];
							}
						}
						
						
						//display matrix
						for (int i = 0; i < rows; i++) {
					        for (int j = 0; j < column; j++) {
					            System.out.print(m[i][j] + " ");
					        }
					        System.out.println();
					    }
						
					}

		}
		
			
		
		
		
		
	}
	
	
	private static void multiplicationmatrix(int[][] a, int[][] b) throws Exception {
		// TODO Auto-generated method stub
		//check rows and column
		int rows=a.length;
		int column=b[0].length;
		
		int[][] m =new int[rows][column];
		
		if(a!=null && b!=null)
		{
			
			
			if(!(a[0].length==b.length ))
			{
				throw new Exception("matrix multiplication not possible given rows and column");
			}
					else
					{
						for (int i = 0; i <rows ; i++) {
							
							for (int j = 0; j < column; j++) {
								
								int sum=0;
								for (int k = 0; k < a[0].length; k++) {
									
									//multiplication
									sum+=a[i][k]*b[k][j];
									
								}
								m[i][j]=sum;   
								
							}
						}
						
						
						//display matrix
						 System.out.println("Resulting Matrix:");
						    for (int i = 0; i < rows; i++) {
						        for (int j = 0; j < column; j++) {
						            System.out.print(m[i][j] + " ");
						        }
						        System.out.println();
						    }
						
					}

		}
		
		
		
		
			
		
		
		
		
	}
	
	
	public static void transpose(int[][] a)
	{
		int rows=a.length;
		int columns =a[0].length;
		
		//new matrix
		int[][] c=new int[columns][rows];
		
		
		for (int i = 0; i < rows*columns; i++) {
			
			 int  row=i % rows;
			int col=i/rows;
			
			c[col][row]=a[row][col];
		}
		
		
		
		//display matrix
		 System.out.println("Resulting Matrix:");
		    for (int i = 0; i < rows; i++) {
		        for (int j = 0; j <columns ; j++) {
		            System.out.print(c[i][j] + " ");
		        }
		        System.out.println();
		    }
		
	}
	
	
	public static boolean isSymmetric(int[][] a)
	{
		// 4 4
		// 4 4
		
		transpose(a);
 		int rows=a.length;  //2
		int columns =a[0].length; //2
		
		//new matrix
		
		if(rows !=columns) //2 ==2
		{
			return false;
		}
		
		for (int i = 0; i < rows; i++) {  //0
			
			for (int j = 0; j < columns; j++) { //0
				
				if(a[i][j] !=a[j][i]) //a[0][0] =a[0][0]
				{
					return false;
				}
			}
			 
			
			
			
		}
		return true;
		
		
		
		
	}
	
	
	
}
