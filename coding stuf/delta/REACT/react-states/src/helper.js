function genNumber(n){
    let arr=new Array(n);
    for (let i = 0; i < arr.length; i++) {
        arr[i]=Math.floor(Math.random()*10);
    }
    return arr;

};

function sum(arr){
    return arr.reduce((sum,curr)=>sum+curr,0);
    
}
export {genNumber,sum};
