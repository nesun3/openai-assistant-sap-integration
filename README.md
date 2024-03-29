<div>
  
[![Open Source Love](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![GitHub](https://img.shields.io/badge/sap_integration-Custom-blue)
</div>

<h1>Knowledge-Based Chatbot</h1>

## Description
<p>
Building a Knowledge-Based Chatbot with OpenAI’s Assistants API and SAP Cloud Integration.
</p>

## Overview
This project showcases how to integrate OpenAI’s Assistants API with SAP Cloud Integration. While numerous codes and blogs on this subject predominantly use Python or Node.js, I aim to offer an alternative approach. As in my previous project, I strive to explore unconventional ways to harness the inherent capabilities of SAP Cloud Integration, pushing the boundaries of what can be achieved within this framework. With this goal in mind, I embark on the same journey once again.

In this project, I will guide you through the process of creating a Movie Expert assistant that can answer questions and provide recommendations based on a custom knowledge base from a [movies_2023.txt](https://github.com/nesun3/openai-assistant-sap-integration/blob/507b39ea1c35cc588c54fe5cc7149bb982f2ac7f/samples/movies_2023.txt) file.

*Please note that I have only built the complete backend API development, which can be consumed by any Frontend Framework like Vanilla JS, React, SAP UI5, SAP Build Apps, etc. to create the frontend chat interface. To demonstrate the frontend, I will use Postman and show all necessary APIs that can be consumed by Frontend Framework to create the frontend chat interface.*

A write-up about this project can be found here: https://blogs.sap.com/2024/01/01/building-a-knowledge-based-chatbot-with-openais-assistants-api-and-sap-cloud-integration/

> [!IMPORTANT]
You can use the prototype to create your own AI assistant capable of accepting user questions and providing responses based on the knowledge base of your document.

## Solution Diagrams
## ![Knowledge Retrieval Tool Flow Diagram](https://github.com/nesun3/openai-assistant-sap-integration/blob/2075927d40b2d33d14d735a37a4046b6f6124ab6/Build%20Knowledge%20Bot%20using%20SAP%20Cloud%20Integration-v1.png)

## Requirements
 - You will need a SAP Cloud Integration tenant to consume, test and enhance this integration artifacts.
 - Postman to test the backend APIs.
 - OpenAI API Key from [OpenAI account](https://platform.openai.com/api-keys).

## Download and Installation
This repository contains
1. [Integration Package](https://github.com/nesun3/openai-assistant-sap-integration/blob/66d9adc9da7fc0b0e5af59ee6d7c66fa2b920b93/build/OpenAI%20Integration%20with%20SAP%20Cloud%20Integration.zip) - Download the Integration package named `OpenAI Integration with SAP Cloud Integration.zip` and import it to your tenant.
2. [Source Code](https://github.com/nesun3/openai-assistant-sap-integration/tree/66d9adc9da7fc0b0e5af59ee6d7c66fa2b920b93/src) - The unzip or raw file contents of each integration flows.
3. [Postman Collection](https://github.com/nesun3/openai-assistant-sap-integration/blob/b63ba5709d9e8d8707929870118918cb896c6388/build/postman_collection.zip)- download the corresponding Zip file. Unzip and import the collections and environment.

## Documentation
To learn how to use the integration artifacts, please refer to the [blog](https://blogs.sap.com/2024/01/01/building-a-knowledge-based-chatbot-with-openais-assistants-api-and-sap-cloud-integration/) for step by step guide.

## Features
 - No Chunking, no embeddings, and no vector database are required.
 - Your own AI assistant capable of accepting user questions and providing responses based on the knowledge base of your document.

## Limitations and Future Work
 - Refer to the OpenAI documentation to understand the [limitations](https://platform.openai.com/docs/assistants/how-it-works/limitations). Please note that these limitations are subject to change as the API is still in beta and OpenAI is actively working on adding more functionality. Therefore, be sure to keep up with the latest developments by exploring the Assistant API docs frequently.


## How to obtain support

[Create an issue]( https://github.com/nesun3/openai-assistant-sap-integration/issues) in this repository if you find a bug or have questions about the content.

For additional support, ask a question in the [Comment section](https://blogs.sap.com/2024/01/01/building-a-knowledge-based-chatbot-with-openais-assistants-api-and-sap-cloud-integration/).


## License
See the [LICENSE](LICENSE) file for details.


## 🌱 Support the Project

>**Encourage this repo by giving it a star. If you like this concept, click on 'Star' [on the top right of the screen]. This is the GitHub equivalent of '👍 ' or 'like' or '+1'**.

*If you've found my work helpful in your project, please consider buying me a coffee to show your support!*

<a href="https://www.buymeacoffee.com/nesun3" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>


<hr>
<p align="center">
Coded with ❤️ from India 🇮🇳 
</p>
