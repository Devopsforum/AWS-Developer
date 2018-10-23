package SpotUrbeer.s3integration;


import java.io.IOException;
import java.util.List;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;

/**
 * Hello world!
 *
 */
public class S3ListBuckets {
	public static void main(String[] args) throws IOException {
		AWSCredentials credentials = new BasicAWSCredentials("AccessKey", "SecretKey");

		ClientConfiguration clientConfig = new ClientConfiguration();
		clientConfig.setProtocol(Protocol.HTTP);

		AmazonS3 conn = new AmazonS3Client(credentials, clientConfig);
		List<Bucket> buckets =  conn.listBuckets();
		for (Bucket bucket : buckets) {
			System.out.println("Bucket Name"+bucket.getName());
		}
	}

}
