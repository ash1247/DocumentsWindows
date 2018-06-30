class Stackframe {
	
	int stack [] = new int[10];
	int index;
	Stackframe()
	{
		index =- 1;
	}
	void push (int data_item)
	{
	if (index == 9)
		System.out.println("Stack is full");
		else
		stack[++index] = data_item;
	}
	int pop() {
		if (index < 0)
		{
			System.out.println("Stack is underflow");
			return 0;
		}
		else
			return stack[index--];
	}

}

