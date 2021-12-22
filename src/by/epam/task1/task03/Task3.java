package by.epam.task1.task03;


class SquareArea implements SquareAreaService {

    public  double SecondSqrR(double sqR){
        if (sqR>0){
        return sqR/2;
        }
        return -1;
    }

    public  int ratioOfSquares(double firstSqr,double secondSqr){
        return ((int) (firstSqr/secondSqr));
    }

}