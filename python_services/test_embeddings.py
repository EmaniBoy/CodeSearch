# test_embeddings.py
from transformers import AutoTokenizer, AutoModel
import torch

def main():
    tokenizer = AutoTokenizer.from_pretrained("microsoft/codebert-base")
    model = AutoModel.from_pretrained("microsoft/codebert-base")

    sample_code = "def hello_world():\n    print('Hello, world!')"
    inputs = tokenizer(sample_code, return_tensors="pt", truncation=True, max_length=512)
    with torch.no_grad():
        outputs = model(**inputs)
    embedding = outputs.last_hidden_state.mean(dim=1).numpy()
    print("Embedding shape:", embedding.shape)

if __name__ == "__main__":
    main()
