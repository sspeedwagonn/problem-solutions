-- The Count Function
SELECT COUNT(Name) FROM CITY WHERE POPULATION > 100000;
-- The Sum Function
SELECT SUM(Population) FROM CITY WHERE DISTRICT = 'California';
-- Averages
SELECT AVG(Population) FROM CITY WHERE DISTRICT = 'California';