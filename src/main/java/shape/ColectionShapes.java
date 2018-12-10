package shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ColectionShapes {
    private Logger log = LogManager.getLogger(ColectionShapes.class);
    private FileInside fileInside = FileInside.getInstance();
    private List<String> sourses = fileInside.getSources();

    public ColectionShapes() {
    }

    public FileInside getFileInside() {
        return fileInside;
    }

    public void setFileInside(FileInside fileInside) {
        this.fileInside = fileInside;
    }


    public ArrayList<Cube>  addCube(){
        ArrayList<Cube> shapes = new ArrayList<>();
        sourses = fileInside.getSources();
        for (int j = 0; j < sourses.size(); j++){
            String str = sourses.get(j);
            String[] strs = str.split(" ");
            double[] values;
            if(strs.length > 4){
                log.info("Uncorrect data at " + (j+1) + " string");
                continue;
            }else {
                values = new double[4];
            }
            try {
                for (int i = 0; i < strs.length; i++) {
                    values[i] = Double.parseDouble(strs[i]);
                    if(i == 0 && values[i] <= 0){
                        log.info("Uncorrect data at " + (j+1) + " string");
                        continue;
                    }
                }
            }catch (NumberFormatException e){
                log.info("Uncorrect data at " + (j+1) + " string");
                continue;
            }
            shapes.add(new Cube(values[0],values[1],values[2],values[3]));
        }
        return shapes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColectionShapes that = (ColectionShapes) o;
        List<String> list1 = this.sourses;
        List<String> list2 = that.sourses;
        if(list1.size() != list2.size()){
            return false;
        }
        for(int i = 0;i<list1.size();i++){
            if(!list1.get(i).equals(list2.get(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourses);
    }

    @Override
    public String toString() {
        return "ColectionShapes{" +
                "sourses=" + sourses +
                '}';
    }
}
