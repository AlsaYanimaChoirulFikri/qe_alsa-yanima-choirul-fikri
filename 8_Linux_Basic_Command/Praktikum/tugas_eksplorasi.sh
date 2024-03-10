#!/bin/sh

API_ENDPOINT="https://jsonplaceholder.typicode.com/posts"

read -p "Masukan Judul: " title
read -p "Masukan body: " body
read -p "Masukan user ID: " userId

REQUEST_BODY=$(cat <<EOF
{
  "title": "$title",
  "body": "$body",
  "userId": $userId
}
EOF
)

echo "Sending request..."
RESPONSE=$(curl -s -X POST "$API_ENDPOINT" \
     -H "Content-Type: application/json" \
     -d "$REQUEST_BODY")

echo "$RESPONSE"

echo "Done"
