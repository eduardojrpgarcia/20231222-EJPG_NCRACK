import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;

public class DynamicCombinator {

	public void D8Generator() throws IOException {
		
		LinkedHashMap<Integer, Character> collection = CharCollection.get();
		int limit = collection.size();
		
		LocalDateTime start = LocalDateTime.now();
		System.out.println("START: " + start);
		
		OutputStream stream = new FileOutputStream("D8WORLDLIST.TXT");
		
		for (int a = 0; a < limit; a++) {
			char aId = collection.get(a);
			
			for (int b = 0; b < limit; b++) {
				char bId = collection.get(b);
				
				for (int c = 0; c < limit; c++) {
					char cId = collection.get(c);
					
					for (int d = 0; d < limit; d++) {
						char dId = collection.get(d);
						
						for (int e = 0; e < limit; e++) {
							char eId = collection.get(e);
							
							for (int f = 0; f < limit; f++) {
								char fId = collection.get(f);
								
								for (int g = 0; g < limit; g++) {
									char gId = collection.get(g);
									
									
									for (int h = 0; h < limit; h++) {
										char hId = collection.get(h);
										
										String line = aId + "" + bId + "" + cId + "" + dId + "" + eId + "" + fId + "" + gId + "" + hId + "\n";
										stream.write(line.getBytes());
									}
								}
							}
						}
					}
				}
			}
		}
		
		LocalDateTime stop = LocalDateTime.now();
		System.out.println("STOP: " + stop);
		stream.flush();
		stream.close();
	}
	
}
