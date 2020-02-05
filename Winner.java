

public class Winner 
{
	
	
	
	
	public boolean checkXresult(int[][] arr)
	{
		if(arr[0][0]==1 && arr[1][0] ==1 && arr[2][0] ==1)
		{
			return true;
		}
		if(arr[0][1]==1 && arr[1][1] ==1 && arr[2][1] ==1)
		{
			return true;
		}
		if(arr[0][2]==1 && arr[1][2] ==1 && arr[2][2] ==1)
		{
			return true;
		}
		if(arr[0][0]==1 && arr[0][1] ==1 && arr[0][2] ==1)
		{
			return true;
		}
		if(arr[1][0]==1 && arr[1][1] ==1 && arr[1][2] ==1)
		{
			return true;
		}
		if(arr[2][0]==1 && arr[2][1] ==1 && arr[2][2] ==1)
		{
			return true;
		}
		if(arr[0][0]==1 && arr[1][1] ==1 && arr[2][2] ==1)
		{
			return true;
		}
		if(arr[2][0]==1 && arr[1][1] ==1 && arr[0][2] ==1)
		{
			return true;
		}
		
		
		return false;
	}
	
	public boolean checkOresult(int[][] arr)
	{
		if(arr[0][0] ==0 && arr[1][0] == 0 && arr[2][0] == 0)
		{
			return true;
		}
		if(arr[0][1] ==0 && arr[1][1] == 0 && arr[2][1] == 0)
		{
			return true;
		}
		if(arr[0][2] ==0 && arr[1][2] == 0 && arr[2][2] == 0)
		{
			return true;
		}
		if(arr[0][0] ==0 && arr[0][1] == 0 && arr[0][2] == 0)
		{
			return true;
		}
		if(arr[1][0] ==0 && arr[1][1] == 0 && arr[1][2] == 0)
		{
			return true;
		}
		if(arr[2][0] ==0 && arr[2][1] == 0 && arr[2][2] == 0)
		{
			return true;
		}
		if(arr[0][0] == 0 && arr[1][1] == 0 && arr[2][2] == 0)
		{
			return true;
		}
		if(arr[2][0] == 0 && arr[1][1] == 0 && arr[0][2] == 0)
		{
			return true;
		}
		
		return false;
	}
	
	
}
