select w.id 
from Weather w,Weather we
where DATEDIFF(w.recordDate,we.recordDate)=1 AND w.temperature>we.temperature;