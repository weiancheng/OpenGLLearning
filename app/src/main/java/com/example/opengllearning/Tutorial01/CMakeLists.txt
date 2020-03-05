add_library(tutorial01 SHARED
        jni/jni.cpp)

set(tutorial_dir ${CMAKE_CURRENT_SOURCE_DIR}/)

target_compile_definitions(tutorial01 PUBLIC GLES_VERSION=2)

target_link_libraries(tutorial01
        android
        log
        GLESv3
        GLESv2
        EGL)

set_target_properties(toturial01
        PROPERTIES
        ARCHIVE_OUTPUT_DIRECTORY
        libs/)