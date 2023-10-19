function sortDesc(arr){

    for(let i=0; i<arr.length; i++){
        for(let j=0;j<arr.length-1;j++){
            if(arr[i]>arr[j]){
                var temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    return arr;
}


const arr=[5,2,7,9,1,0];
const sortArr=sortDesc(arr.slice());

console.log("Array before Sorting :" +arr);
console.log("Array after descending sort: " +sortArr);