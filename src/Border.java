import java.util.ArrayList;
import java.util.Random;

public class Border {
final int borderSize=4;

Random random=new Random();

    Piece[][] border=new Piece[borderSize][borderSize];

    public Border(){
        for(int i=0;i<borderSize;i++){
            for(int j=0;j<borderSize;j++){
                Piece p= new Piece();
                p.setValue(0);
                border[i][j]=p;        
            }
        }
    }

    public void print(){
        for(int i=0;i<borderSize;i++){
            for(int j=0;j<borderSize;j++){
                System.out.print(border[i][j].getValue());
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    /**
     * 随机生成一个棋子
     */
    public boolean randomPiece(){
        boolean getNewValue=false;
        
        int xIndex=random.nextInt(borderSize);
        int yIndex=random.nextInt(borderSize);
        if(border[xIndex][yIndex].getValue()==0){
            border[xIndex][yIndex].setValue(2);
            getNewValue=true;    
        }else{
            boolean nextGetValue=randomPiece();
            return getNewValue;
        }    
        //retrun getNewValue;
        return getNewValue;
    }

    /**
     * 随机生成一个棋子
     */
    public void randomPiece2(){
        ArrayList<Piece> emptyPieceList=new ArrayList<>();
        for(int i=0;i<borderSize;i++){
            for(int j=0;j<borderSize;j++){
                if(border[i][j].getValue()==0){
                    emptyPieceList.add(border[i][j]);
                }
            }
        }
        if(emptyPieceList.size()==0){
            //还能进行合并，如果没有能合并的，游戏结束
            System.out.println("已没有空格");
        }else{
            int randomNo=random.nextInt(emptyPieceList.size());
            Piece randomPiece=emptyPieceList.get(randomNo);
            randomPiece.setValue(2);
        }

    }
}
