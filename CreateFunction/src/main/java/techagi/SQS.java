package techagi;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * This sample demonstrates how to make basic requests to Amazon SQS using the
 * AWS SDK for Java.
 * <p>
 * Prerequisites: You must have a valid Amazon Web Services developer account,
 * and be signed up to use Amazon SQS. For more information about Amazon SQS,
 * see https://aws.amazon.com/sqs
 * <p>
 * Make sure that your credentials are located in ~/.aws/credentials
 */

public class SQS {
    private static String SQSName = "MySqsQueue";
    final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();

    final GetQueueUrlResult queueUrl = sqs.getQueueUrl(SQSName);

    Gson gson = new GsonBuilder().setPrettyPrinting().create();


    public void sqs(Account account) {
        System.out.println("Sending a message to MyQueue.\n");
        sqs.sendMessage(new SendMessageRequest(queueUrl.getQueueUrl(), gson.toJson(account)
        ));
    }
}