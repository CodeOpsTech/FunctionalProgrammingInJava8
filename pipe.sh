cat limerick.txt | tr -cs "[:alpha:]" "\n" | awk '{print length(), $0}'  | sort | uniq 
