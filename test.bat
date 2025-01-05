@ECHO OFF
ECHO "call http://localhost:8080/hello with delay 1 sec"

for /l %%x in (1,1,100) do (
  curl http://localhost:8080/hello
  timeout /t 1 /nobreak >nul
  ECHO .
)

ECHO "DONE"