String cons = " ";
println " Enter a serie of numbers and when you want to stop enter -1:"
String str = System.console().readLine()
int n1;
n1 = Integer.parseInt(str);
int n2 = n1 + 1;

while ( n1 != -1){

 str = System.console().readLine()
 n1 = Integer.parseInt(str)
 if (n1 == -1) break;
 if (n2 != n1){
  cons = "Not";
  }

 n2 = n1 +1;

}


println " the serie of numbers you entered is " + cons + " consecutive";
