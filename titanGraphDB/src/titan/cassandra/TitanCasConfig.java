package titan.cassandra;

import org.apache.commons.configuration.BaseConfiguration;
import org.apache.commons.configuration.Configuration;

import com.thinkaurelius.titan.core.TitanFactory;
import com.thinkaurelius.titan.core.TitanGraph;
import com.tinkerpop.blueprints.Vertex;

public class TitanCasConfig {

	public static void main(String[] args) {

		System.out.println("Arijit");
		
		Configuration conf = new BaseConfiguration();
		conf.setProperty("storage.backend","cassandra");
		conf.setProperty("storage.hostname","127.0.0.1");
		conf.setProperty("storage.port","9160");
		TitanGraph g = TitanFactory.open(conf);
		System.out.println("ggg:  " + g);
		Vertex v = g.addVertex("marko");
		v.setProperty("age", 31);
		System.out.println("done");

	}

}
