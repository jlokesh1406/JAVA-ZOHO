
            if(arr[i]==0)
            {
                int temp=arr[i];
                arr[i]=arr[z];
                arr[z]=temp;
                z++;
                i++;
            }
            else if(arr[i]==2)
            {