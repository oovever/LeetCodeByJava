import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/4/15.
 */
public class Let56 {
    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public List<Interval> merge(List<Interval> intervals) {
            int n=intervals.size();
            int[] start=new int[n];
            int[] end=new int[n];
            for(int i=0;i<n;i++){
                start[i]=intervals.get(i).start;
            }
            for(int i=0;i<n;i++){
                end[i]=intervals.get(i).end;
            }
        Arrays.sort(start);
        Arrays.sort(end);
        List<Interval>list=new ArrayList<>();
        for(int i=0,j=0;i<n;i++){
            if(i==n-1||start[i+1]>end[i]){
                list.add(new Interval(start[j],end[i]));
                j=i+1;
            }
        }
        return list;
    }
}
