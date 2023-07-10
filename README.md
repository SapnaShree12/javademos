const AWS = import('aws-sdk');

const dynamodb = new AWS.DynamoDB.DocumentClient({ region: ' us-west-1' });


exports.handler = async (event) => {

  const { username, password } = JSON.parse(event.body);


  try {

    // Check if the user exists in DynamoDB

    const params = {

      TableName: 'users',

      Key: { username }

    };

    const data = await dynamodb.get(params).promise();


    if (!data.Item) {

      return {

        statusCode: 401,

        body: JSON.stringify({ message: 'Invalid credentials' })

      };

    }


    // Validate the password

    if (data.Item.password !== password) {

      return {

        statusCode: 401,

        body: JSON.stringify({ message: 'Invalid credentials' })

      };

    }


    // Successful login

    return {

      statusCode: 200,

      body: JSON.stringify({ message: 'Login successful' })

    };

  } catch (error) {

    console.error('Error:', error);

    return {

      statusCode: 500,

      body: JSON.stringify({ message: 'Internal server error' })

    };

  }

};
