package com.amigoscode.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("amigoscode-image-upload-960");

    private final String bucketName;


    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }

}
