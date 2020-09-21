INSERT INTO DEPT2(DCODE
                , DNAME
                , PDEPT
                , AREA
                )
        VALUES (9000
                , 'temp_1'
                , 1006
                , 'Temp_Area'
                );

INSERT INTO DEPT2
        VALUES (9001
                , 'temp_1'
                , 'Temp_Area'
                );
rollback;
COMMIT;
select * from dept2
order by dcode desc;