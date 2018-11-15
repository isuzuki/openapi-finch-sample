.PHONY: openapi-generate

openapi-generate:
	openapi-generator generate -i openapi.yaml -g scala-finch -t src/main/resources --api-package=io.github.isuzuki.api --model-package=io.github.isuzuki.model --additional-properties packageName=io.github.isuzuki
