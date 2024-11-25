import javax.swing.JFrame;

import edu.fcps.Bucket;

public class Driver4b {

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
	      Bucket fourG = new Bucket(4);
	      fourG.fill(); //4
	  
	      fourG.pourInto(threeG);
	      threeG.spill();
	      fiveG.fill();
	   
	      fiveG.pourInto(threeG);
	      threeG.spill();
	      fourG.spill();

	      
	      threeG.fill();
	      fourG.fill();
	      fiveG.fill();
	     
	  
	      fiveG.spill();
	      fourG.pourInto(fiveG);
	     
	      fourG.fill();
	      
	      threeG.spill();
	      fourG.pourInto(threeG);
	      threeG.spill();
	  
	      fourG.pourInto(threeG);
	      
	      fiveG.fill(); 
	      fourG.fill();
	   }

}
