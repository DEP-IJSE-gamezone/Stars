void main() {
    int rows = 1, col = 0,noOfcol=1;
    while (rows < 8) {

        System.out.print(col == noOfcol? "\n" : " * ");
        if (noOfcol == col++) {
            col = 0;
            rows++;
        }

        noOfcol=rows>4?8-rows:rows;
    }
}
/*
*
* *
* * *
* * * *
* * *
* *
* 
 */
