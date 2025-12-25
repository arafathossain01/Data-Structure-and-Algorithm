### how to use freopen?

- freopen is use in competitive programming. It is used for big input and showing output. In console the big input and output are not suitable to show. That's why we used it. First create a <b>input.txt</b> file and a <b>output.txt</b> file. Create a main.cpp file then in cpp file write code and put here freopen like this:

```js
    int main(){ 
        freopen("input.txt", "r", stdin);
        freopen("output.txt", "w", stdout); 
        int a,b;
        cin >>a >>b;
        cout<<a+b; 
        return 0;
        }
```
The first freopen is read the value from input.txt file and last freopen is show the output in output.txt file.

### Command line
- g++ main.cpp -o main
- ./main
