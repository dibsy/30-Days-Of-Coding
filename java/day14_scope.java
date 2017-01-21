	// Add your code here
    public Difference(int[]a){
        elements = new int[a.length];
        for(int i=0;i<a.length;i++)
            elements[i]=a[i];
    }
    public void computeDifference(){
        for(int i=0;i<elements.length;i++){
            for(int j=0;j<elements.length;j++){
                if(i!=j){
                    if(Math.abs(elements[i]-elements[j])> maximumDifference)
                         maximumDifference = Math.abs(elements[i]-elements[j]);
                }
            }
        }
    }
