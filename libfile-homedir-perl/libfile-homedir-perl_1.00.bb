SUMMARY = "File::HomeDir Perl module from CPAN"
AUTHOR = "Adam Kennedy <adamkd@cpan.org>"
HOMEPAGE = "http://svn.ali.as/cpan/trunk/File-HomeDir"
SECTION = "libs"
LICENSE = "GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b41a38c91c3e99543225495ccf83895d"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/File-HomeDir-${PV}.tar.gz"
SRC_URI[md5sum] = "aa290cab9db52e2f76280fd1febf794e"
SRC_URI[sha256sum] = "85b94f3513093ec0a25b91f9f2571918519ae6f2b7a1e8546f8f78d09a877143"

S = "${WORKDIR}/File-HomeDir-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-carp \
                   perl-module-file-path \
                   libfile-spec-perl \
                   libfile-temp-perl \
                   libfile-which-perl \
                   "

RPROVIDES_${PN} += "libfile-homedir-darwin-perl \
                    libfile-homedir-darwin-carbon-perl \
                    libfile-homedir-darwin-cocoa-perl \
                    libfile-homedir-driver-perl \
                    libfile-homedir-freedesktop-perl \
                    libfile-homedir-macos9-perl \
                    libfile-homedir-test-perl \
                    libfile-homedir-unix-perl \
                    libfile-homedir-windows-perl \
                    libfile-homedir-ties-perl \
                    "

BBCLASSEXTEND = "native"

