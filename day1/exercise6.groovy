String str = "";
println " Enter 1st number:"
str = System.console().readLine()
int N1 = Integer.parseInt(str)
println "Enter the 2nd number:"
str = System.console().readLine()
int N2 = Integer.parseInt(str)

int n1, n2;
if (N1 > N2){
 n1 = N1;
 n2 = N2;
}
else {
 n1 = N2;
 n2 = N1;
}
 
int rem = n1;
int div = 0;


while ( rem >= n2){
 rem = rem - n2;
 div++;
}
println n1 + " divided by " + n2 + " is " + div + " and the remainder is " + rem;