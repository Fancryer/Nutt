### Создание и удаление файлов и директорий:

-    [x] createFile(<span style="color:pink">path</span>) - создание пустого файла по указанному пути.

```
funct create_file(path:String)=
   /| NATIVE CODE |\
return
```

-    [x] deleteFile(<span style="color:pink">path</span>) - удаление файла по указанному пути.

```
funct delete_file(path:String,delete_directory:Boolean=false)=
   /| NATIVE CODE |\
return
```

-    [x] createDirectory(<span style="color:pink">path</span>) - создание директории по указанному пути.

```
funct create_directory(path:String)=
   /| NATIVE CODE |\
return
```

-    [x] deleteDirectory(<span style="color:pink">path</span>,<span style="color:#B28427">recursive</span>) -
     рекурсивное
     удаление директории по указанному пути.

```
funct delete_directory(path:String,recursive:Boolean=false)=
   /| NATIVE CODE |\
return
```

### Чтение и запись файлов:

-    [x] readFile(<span style="color:pink">path</span>) - чтение содержимого файла в виде массива байтов или строки.

```
funct read_file(path:String):Array|StringOrBinary[{}]=
   /| NATIVE CODE |\
return
```

-    [x] writeFile(<span style="color:pink">path</span>, <span style="color:yellow">data</span>) - запись данных в файл.
     Может принимать массив байтов или строку.

```
funct write_file(path:String,data:StringOrBinary)=
   /| NATIVE CODE |\
return
```

-    [ ] appendFile(<span style="color:pink">path</span>, <span style="color:yellow">data</span>) - дописывание данных в
     конец файла.

```
funct append_file(path:String,data:StringOrBinary)=
   /| NATIVE CODE |\
return
```

### Работа с путями:

-    [ ] joinPath(<span style="color:pink">...paths</span>) - объединение двух путей в
     один.

```
funct join_path(...paths:String):String=
   /| NATIVE CODE |\
return
```

-    [ ] getAbsolutePath(<span style="color:pink">path</span>) - получение абсолютного пути для указанного пути.

```
funct get_absolute_path(path:String):String=
   /| NATIVE CODE |\
return
```

-    [ ] getRelativePath(<span style="color:pink">from</span>, <span style="color:pink">to</span>) - получение
     относительного пути от первого пути до второго.

```
funct get_relative_path(from:String,to:String):String=
   /| NATIVE CODE |\
return
```

### Проверка существования файлов и директорий:

-    [ ] fileExists(<span style="color:pink">path</span>) - проверка существования файла по указанному пути.

```
funct file_exists(path:String):Boolean=
	/| NATIVE CODE |\
return
```

-    [ ] directoryExists(<span style="color:pink">path</span>) - проверка существования директории по указанному пути.

```
funct directory_exists(path:String):Boolean=
    /| NATIVE CODE |\
return
```

### Получение информации о файлах и директориях:

-   [ ] getFileAttributes(<span style="color:pink">path</span>) - получение атрибутов файла (размер, время создания и
    изменения).

```
record Date
{
	'year':Int,
	'month':Int,
	'day':Int,
	'hours':Int,
	'minutes':Int,
	'seconds':Int,
	'milliseconds':Int
}

record FileAttributes
{
	'size':Int,
	'createdAt':Date,
	'modifiedAt':Date
}

funct get_file_attributes(path:String):FileAttributes=
	/| NATIVE CODE |\
return
```

-    [ ] getDirectoryContents(<span style="color:pink">path</span>) - получение списка файлов и директорий в указанной
     директории.

```
funct get_directory_contents(path:String):Array|String=
    /| NATIVE CODE |\
return
```

-    [ ] getDirectorySize(<span style="color:pink">path</span>) - получение размера директории (в байтах).

```
funct get_directory_size(path:String):Int=
   /| NATIVE CODE |\
return
```

### Другие функции:

-    [ ] renameFile(<span style="color:pink">path</span>, <span style="color:pink">newPath</span>) - переименование
     файла
     или директории.

```
funct rename_file(path:String,new_path:String)=
   /| NATIVE CODE |\
return
```

-    [ ] copyFile(<span style="color:pink">sourcePath</span>, <span style="color:pink">destinationPath</span>) -
     копирование файла.

```
funct rename_file(source_path:String,destination_path:String)=
   /| NATIVE CODE |\
return
```

-    [ ] moveFile(<span style="color:pink">sourcePath</span>, <span style="color:pink">destinationPath</span>) -
     перемещение файла.

```
funct move_file(source_path:String,destination_path:String)=
   /| NATIVE CODE |\
return
```

-    [ ] getFreeDiskSpace(<span style="color:pink">path</span>) - получение количества свободного места на диске.

```
funct get_free_disk_space(path:String):Int=
   /| NATIVE CODE |\
return
```