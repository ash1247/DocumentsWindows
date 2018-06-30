#include<iostream>
#include<stack>
#include<string>
using namespace std;
// Function to check whether two characters are opening
// and closing of same type.

bool ArePair(char opening, char closing);
bool AreParanthesesBalanced(string exp);

int main()
{
	/*Code to test the function AreParanthesesBalanced*/
	string expression;
	cout<<"Enter an expression:  "; // input expression from STDIN/Console
	cin>>expression;
	if(AreParanthesesBalanced(expression))
		cout<<"Balanced\n";
	else
		cout<<"Not Balanced\n";
}

bool ArePair(char opening, char closing)
{
    if( opening == '(' && closing == ')' )
    {
        return true;
    }
    else if( opening == '{' && closing == '}' )
    {
        return true;
    }
    else if( opening == '[' && closing == ']' )
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool AreParanthesesBalanced(string exp)
{
    stack<char> s;
    for(int i = 0; i < exp.length(); i++ )
    {
        if( exp[i] == '(' || exp[i] == '{' || exp[i] == '[' )
        {
            s.push( exp[i] );
        }
        else if( exp[i] == ')' || exp[i] == '}' || exp[i] == ']' )
        {
            if( s.empty() || ( !ArePair(s.top(), exp[i] ) ) )
            {
                return false;
            }
            else
            {
                s.pop();
            }
        }
    }
    return s.empty() ? true:false;
}
