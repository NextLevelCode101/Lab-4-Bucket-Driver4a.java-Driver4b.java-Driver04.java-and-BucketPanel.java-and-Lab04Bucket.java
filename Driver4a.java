import javax.swing.JFrame;

import edu.fcps.Bucket;

public class Driver4a {

	   public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Buckets");
	      frame.setSize(600, 400);
	      frame.setLocation(100, 100);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      frame.setContentPane(new BucketPanel());
	      
	      frame.setVisible(true);
	      Bucket.setSpeed(5);
	      Bucket.useTotal(true);
	      
	      Bucket fiveG = new Bucket(5);
	      
	      Bucket threeG = new Bucket(3);
	      
	      fiveG.fill(); 
	      
	      fiveG.pourInto(threeG);
	      
	      threeG.spill();
	      
	      fiveG.pourInto(threeG);
	     
	      fiveG.fill();
	     
	      fiveG.pourInto(threeG);
	      
	      threeG.spill();
	     
	      fiveG.pourInto(threeG);
	     
	      threeG.spill();
	      
	      fiveG.pourInto(threeG);
	      
	      fiveG.fill();
	      
	      threeG.fill();
	      
	      fiveG.spill();
	   }

}
