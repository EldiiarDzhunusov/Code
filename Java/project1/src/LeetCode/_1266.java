package LeetCode;
//finish later
public class _1266 {
    public static void main(String[] args) {
        //int points[][] = {{559,511},{932,618},{-623,-443},{431,91},{838,-127},{773,-917},{-500,-910},{830,-417},{-870,73},{-864,-600},{450,535},{-479,-370},{856,573},{-549,369},{529,-462},{-839,-856},{-515,-447},{652,197},{-83,345},{-69,423},{310,-737},{78,-201},{443,958},{-311,988},{-477,30},{-376,-153},{-272,451},{322,-125},{-114,-214},{495,33},{371,-533},{-393,-224},{-405,-633},{-693,297},{504,210},{-427,-231},{315,27},{991,322},{811,-746},{252,373},{-737,-867},{-137,130},{507,380},{100,-638},{-296,700},{341,671},{-944,982},{937,-440},{40,-929},{-334,60},{-722,-92},{-35,-852},{25,-495},{185,671},{149,-452}};
        int points[][] = {{1,1},{3,4},{-1,0}};
        int size = points.length;
        int ans = 0;
        int[] pos={points[0][0],points[0][1]};
        for (int i = 1; i < size; i++) {
            while(points[i][0]!= pos[0] || points[i][1]!= pos[1]){
                if(points[i][0]< pos[0] && points[i][1]< pos[1]){
                    int val= Math.min(pos[0]-points[i][0],pos[1]-points[i][1]);
                    pos[0]-=val;
                    pos[1]-=val;
                    ans+=val;
                }
                else if(points[i][0]< pos[0] && points[i][1]== pos[1]){
                    int val =pos[0]-points[i][0];
                    pos[0]-=val;
                    ans+=val;
                }
                else if(points[i][0]== pos[0] && points[i][1]< pos[1]){
                    int val =pos[1]-points[i][1];
                    pos[1]-=val;
                    ans+=val;
                }
                //for neg
                else if(points[i][0]> pos[0] && points[i][1]> pos[1]){
                    int val= Math.min(points[i][0]-pos[0],points[i][1]-pos[1]);
                    pos[0]+=val;
                    pos[1]+=val;
                    ans+=val;
                }
                else if(points[i][0]> pos[0] && points[i][1]== pos[1]){
                    int val = points[i][0]-pos[0];
                    pos[0]+=val;
                    ans+=val;
                }
                else if(points[i][0]== pos[0] && points[i][1]> pos[1]){
                    int val = points[i][1]-pos[1];
                    pos[1]+=val;
                    ans+=val;
                }
                else if(points[i][0]> pos[0] && points[i][1]< pos[1]){
                    int val = Math.min(points[i][0]-pos[0],pos[1]-points[i][1]);
                    pos[0]+=val;
                    pos[1]-=val;
                    ans+=val;
                }
                else if(points[i][0]< pos[0] && points[i][1]> pos[1]){
                    int val = Math.min(pos[0]-points[i][0],points[i][1]-pos[1]);
                    pos[0]-=val;
                    pos[1]+=val;
                    ans+=val;
                }

            }
        }
        System.out.println(ans);
    }
}
