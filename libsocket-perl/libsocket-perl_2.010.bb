SUMMARY = "Socket - networking constants and support functions"
AUTHOR = "Paul Evans <leonerd@leonerd.co.uk>"
HOMEPAGE = "https://metacpan.org/module/Socket"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=06f36acfceeef0d60b6f2aa31829e957"

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PE/PEVANS/Socket-2.010.tar.gz"
SRC_URI[md5sum] = "8d71d5c4333396aee381fa459ca5871a"
SRC_URI[sha256sum] = "028a34688e288dc2a287e1ab940ffa34529b44626b9dfbc73dc834ffcb7f26a3"

S = "${WORKDIR}/Socket-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
