404410030 資工三 鄭光宇

假如這裡放的 ANTLR 的 jar 檔無法正常運作，那就必須先從 ANTLR 官網下載 antlr-3.5.2-complete.jar 檔案，
並放在與 Makefile 檔案同目錄下，才能進行下面步驟。

程式執行方式：
直接輸入 make
會編譯好所有東西，然後自動按順序去 parse "hello.c", "for.c", "struct.c" 三個 C 程式碼，
並顯示 lexical analyzer 的輸出結果。

