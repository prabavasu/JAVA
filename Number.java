class Number
{
public static void main(String[] args )
{
Number odd =new Number();
odd.printodd();
Number even =new Number();
even.print_one();
even.print_even3();
even.print_even1();
even.print_even();


}


void printodd()
{

int no=2;
while(no<=10)
{
System.out.println("No = " + no);
no =no+2;
}
}
void print_one()
{
int no=1;
while(no<=13)
{
System.out.println("No = " +no);
no=no+3;
}
}

void print_even1()
{

int no=1;
while(no<=1331)
{
System.out.println("No = " +no);
no=no*11;
}
}
void print_even3()
{
int no=0;
while(no<15)
{
no=no+3;
System.out.println("No = "+ no);
}
}
void print_even()
{
int no=1;
while(no<10)
{
no=no+2;
System.out.println("No = " + no);
}
}
}
