import javax.swing.*;
import edu.fcps.Bucket;
public class Driver04 {

	public static void main(String[] args) {

      JFrame frame = new JFrame("Buckets");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600, 400);
      frame.setLocation(100, 100);
      frame.setContentPane(new BucketPanel());
      frame.setVisible(true);
      
      Bucket.setSpeed(5);
      Bucket.useTotal(false);
      
      Bucket fiveG = new Bucket(5);
      Bucket threeG = new Bucket(3);
      
      fiveG.fill();
      fiveG.pourInto(threeG);
        
      threeG.spill();
        
      fiveG.pourInto(threeG);
      fiveG.fill();
      fiveG.pourInto(threeG);        
		
	}
}