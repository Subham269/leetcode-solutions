class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax=0.0;
        int irs=brackets[0][0];
        for(int i=0;i<brackets.length;i++)
        {
            if(income>0)
            {
                if(i!=0)
                irs=brackets[i][0]-brackets[i-1][0];
                if(irs<income)
                {
                    tax+=(double)(irs*brackets[i][1])/100.0;
                    income-=irs;
                }
                else
                {
                    tax+=(double)(income*brackets[i][1])/100.0;
                    income=0;
                } 
            }
            else
            break;
        }
        return tax;
    }
}